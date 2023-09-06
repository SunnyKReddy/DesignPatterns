package BuilderDesignPattern.BuilderDesignPattern1;

public class Form {
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private String dob;
    private String address;
    private String city;
    private String state;
    private String country;
    private String pincode;
    private String securityQuestion;
    private String securityAnswer;
    private String passwordHint;
    private String backupEmailId;

    public static class FormBuilder {
        private String firstName;
        private String lastName;
        private String emailId;
        private String password;
        private String dob;
        private String address;
        private String city;
        private String state;
        private String country;
        private String pincode;
        private String securityQuestion;
        private String securityAnswer;
        private String passwordHint;
        private String backupEmailId;

        public FormBuilder(String firstName, String lastName, String emailId, String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.emailId = emailId;
            this.password = password;
        }

        public FormBuilder setDob(String dob) {
            this.dob = dob;
            return this;
        }

        public FormBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public FormBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public FormBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public FormBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public FormBuilder setPincode(String pincode) {
            this.pincode = pincode;
            return this;
        }

        public FormBuilder setSecurityQuestion(String securityQuestion) {
            this.securityQuestion = securityQuestion;
            return this;
        }

        public FormBuilder setSecurityAnswer(String securityAnswer) {
            this.securityAnswer = securityAnswer;
            return this;
        }

        public FormBuilder setPasswordHint(String passwordHint) {
            this.passwordHint = passwordHint;
            return this;
        }

        public FormBuilder setBackupEmailId(String backupEmailId) {
            this.backupEmailId = backupEmailId;
            return this;
        }

        public Form build() {
            return new Form(this);
        }
    }

    public Form(FormBuilder formBuilder) {
        this.firstName = formBuilder.firstName;
        this.lastName = formBuilder.lastName;
        this.emailId = formBuilder.emailId;
        this.password = formBuilder.password;
        this.address = formBuilder.address;
        this.dob = formBuilder.dob;
        this.city = formBuilder.city;
        this.state = formBuilder.state;
        this.country = formBuilder.country;
        this.securityQuestion = formBuilder.securityQuestion;
        this.securityAnswer = formBuilder.securityAnswer;
        this.passwordHint = formBuilder.passwordHint;
        this.pincode = formBuilder.pincode;
    }

    @Override
    public String toString() {
        return "Form{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                ", securityQuestion='" + securityQuestion + '\'' +
                ", securityAnswer='" + securityAnswer + '\'' +
                ", passwordHint='" + passwordHint + '\'' +
                ", backupEmailId='" + backupEmailId + '\'' +
                '}';
    }
}
