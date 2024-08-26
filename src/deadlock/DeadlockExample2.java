package deadlock;

class Teacher {
    public void teach(Student student) {
        synchronized (this) {
            System.out.println("Teacher is ready to teach and waiting for the student to be ready...");
            try {
                Thread.sleep(100); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (student) {
                System.out.println("Teacher is teaching the student.");
            }
        }
    }
}

class Student {
    public void study(Teacher teacher) {
        synchronized (this) {
            System.out.println("Student is ready to study and waiting for the teacher to start teaching...");
            try {
                Thread.sleep(100); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (teacher) {
                System.out.println("Student is studying with the help of the teacher.");
            }
        }
    }
}

public class DeadlockExample2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        Runnable teachingTask = () -> teacher.teach(student);
        Runnable studyingTask = () -> student.study(teacher);

        Thread teacherThread = new Thread(teachingTask);
        Thread studentThread = new Thread(studyingTask);

        teacherThread.start();
        studentThread.start();
    }
}


