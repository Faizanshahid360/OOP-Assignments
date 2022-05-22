class ClassObject {
    public static void main(String[] args) {
        class MathAdd {

            int num1;
            int num2;

            public int addNumbers() {

                int addThemUp = num1 + num2;
                return addThemUp;
            }
        }

        MathAdd addition = new MathAdd(); // create a new instance of the class

        // you can access variables from the class 
        addition.num1 = 10; 
        addition.num2 = 20;

        // and use the method from the class to add them up
        System.out.println(addition.addNumbers());

    }
}
