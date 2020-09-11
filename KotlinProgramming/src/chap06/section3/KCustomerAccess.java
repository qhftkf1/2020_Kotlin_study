package chap06.section3;

public class KCustomerAccess {

    public static void main(String[] args){
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();
        KCustomer.Companion.login();

        //Kjob에 대한 객체 생성 후 접근
        Kjob kjob = KCustomer.JOB;
        System.out.println((kjob.getTitle()));

        //KCustomer를 통한 접근
        KCustomer.JOB.setTitle("Accountant");
        System.out.println(KCustomer.JOB.getTitle());
    }
}
