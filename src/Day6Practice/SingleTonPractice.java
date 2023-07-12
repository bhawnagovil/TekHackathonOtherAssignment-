package Day6Practice;

public class SingleTonPractice {



    public static void main(String[] args) {

        ContactDao dao= ContactDao.getInstance();
        System.out.println(dao);
        ContactDao dao1= ContactDao.getInstance();
        System.out.println(dao1);



    }
}
