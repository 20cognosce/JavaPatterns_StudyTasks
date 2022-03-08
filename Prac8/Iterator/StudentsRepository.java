package Prac8.Iterator;

public class StudentsRepository implements Container {
    public String[] names = {"Dmitry" , "Ivan" ,"Andrew" , "Maria"};

    @Override
    public Iterator getIterator() {
        return new StudentsIterator();
    }

    private class StudentsIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
