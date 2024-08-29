package creational.design.pattern;

public class ResponseStructure {
    private int statusCode;
    private String message;
    private Object data;

    // Private constructor to be used by the builder
    private ResponseStructure(Builder builder) {
        this.statusCode = builder.statusCode;
        this.message = builder.message;
        this.data = builder.data;
    }

    @Override
    public String toString() {
        return "ResponseStructure [statusCode=" + statusCode + ", message=" + message + ", data=" + data + "]";
    }

    // Static nested Builder class
    public static class Builder {
        private int statusCode;
        private String message;
        private Object data;

        public Builder setStatusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setData(Object data) {
            this.data = data;
            return this;
        }

        public ResponseStructure build() {
            return new ResponseStructure(this);
        }
    }
}

