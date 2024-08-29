package creational.design.pattern;

public class BuilderPatternExample {
    public static void main(String[] args) {
        // Use the builder to construct a response
        ResponseStructure response = new ResponseStructure.Builder()
            .setStatusCode(200) // HTTP status code for success
            .setMessage("Operation successful")
            .setData("Data here") // Example data
            .build();

        // Print the built response
        System.out.println(response);
    }
}
