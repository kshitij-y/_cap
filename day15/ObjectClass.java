public class ObjectClass {
    int id;
    String name;
    public ObjectClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "ObjectClass: [id: " + this.id + ", Name: " + this.name + "]";
    }
    @Override
    public boolean equals(Object ref){
        ObjectClass obj = (ObjectClass) ref;
        return this.id == obj.id && this.name  == obj.name;
    }
    public static void main(String[] args) {
        ObjectClass ref = new ObjectClass(1, "Kshitij");
        ObjectClass ref1 = new ObjectClass(1, "Kshitij");

        System.out.println(ref == ref1);  //compares address
        System.out.println(ref.equals(ref1));
        /**
         * Before Overriding equlas() -> compares address
         * After Overriding equlas() -> compares content
         */
    }
}