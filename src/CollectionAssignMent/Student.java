package CollectionAssignMent;

public class Student implements Comparable<Student>{
        String name;
        int id;
        String major;

public String getName(){
        return name;
        }

public int getId(){
        return id;
        }

public String getMajor(){
        return major;
        }

public Student(String name,int id,String major){
        this.name=name;
        this.id=id;
        this.major=name;
        }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student s = (Student) obj;
        return id == s.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(id, s.id);
    }
    }



