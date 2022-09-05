package GenericDataTypePractise;

class GenericClassExample<T> {
    T i;

    public void data(T i1){
        i = i1;
    }

    public T getI() {
        return i;
    }
}

class CallingGenericClassExample{
    public static void main(String[] args) {
        GenericClassExample<Integer> m1 = new GenericClassExample<>();
        GenericClassExample<String> m2 = new GenericClassExample<>();
        m1.data(5);
        m2.data("Jake");
        System.out.println("m1 value : " + m1.getI() + " , " + "m2 value : " + m2.getI());
    }
}

