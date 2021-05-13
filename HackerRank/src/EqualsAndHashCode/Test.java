package EqualsAndHashCode;

enum RegistrationStatus {

    PENDING("pending"), APPROVED("approved"), DECLINED("declined");
    String value;

    RegistrationStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "RegistrationStatus{" +
                "value='" + value + '\'' +
                '}';
    }

    public static RegistrationStatus fromValue(String value){
        for(RegistrationStatus b : RegistrationStatus.values()){
            if(b.value.equals(value)){
                return b;
            }
        }
        throw new IllegalArgumentException("Not valid");
    }
}



public class Test {

    public static void main(String[] args) {
        String[] newValue = {"pending","rajat","approved"};
        for(String str : newValue){
            if(null!=RegistrationStatus.fromValue(str)){
                System.out.println("RegistrationStatus.fromValue(newValue).value = " + RegistrationStatus.fromValue(str).value);
            } throw new NumberFormatException();
        }
    }

}
