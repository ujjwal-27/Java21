public class StringBufferConcept {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Chelsea");
        name.append(" Football Club");
        name.delete(1, 3);
        name.deleteCharAt(13);
        name.insert(6, "Blues ");
        name.ensureCapacity(2);
        System.out.println(name);
        System.out.println(name.capacity());
    }
}
