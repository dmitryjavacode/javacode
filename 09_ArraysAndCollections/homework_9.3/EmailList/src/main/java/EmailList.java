import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    private TreeSet<String> emailList = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется
        if (emailValidator(email)) {
            email = email.toLowerCase();
            emailList.add(email);
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается список электронных адресов в алфавитном порядке
        return new ArrayList<>(emailList);
    }

    private boolean emailValidator(String mailAddress) {
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9\\_\\-\\.]*[@]{1}[a-z]+[\\.]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mailAddress);
        return matcher.find();
    }

}
