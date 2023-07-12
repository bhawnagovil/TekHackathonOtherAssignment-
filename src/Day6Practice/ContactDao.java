package Day6Practice;


public class ContactDao {
    private static ContactDao contactdao= null;

    private ContactDao(){
       if(contactdao!=null){
           throw new RuntimeException("get your object by getInstance()");
       }
    }
    public static ContactDao getInstance() {
        if (contactdao == null) {
            synchronized (ContactDao.class) {
                if (contactdao == null)
                    contactdao = new ContactDao();
            }
        }

            return contactdao;

        }


    public void getContactDetail(){
        System.out.println("print contact detail");
    }
}
