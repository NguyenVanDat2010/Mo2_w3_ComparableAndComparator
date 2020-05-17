public class Simpson implements Comparable<Simpson> {
    public String name;

    public Simpson() {
    }

    public Simpson(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Simpson simpson) {
        return this.name.compareTo((simpson.name));
    }

    @Override
    public String toString(){
        return "Name = "+name+". ";
    }
}
