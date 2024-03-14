package ex_240311_Test;

import java.util.HashMap;
import java.util.Map;


public class Phone {
	private String name;
    private String tel;
    private String address;

    public Phone(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }
    
    
    
    
    private Map<String, Phone> phoneBook;

    public Phone() {
        this.phoneBook = new HashMap<>();
    }

    public void addPhone(String name, String tel, String address) {
        phoneBook.put(name, new Phone(name, tel, address));
    }

    public void searchPhone(String name) {
        if (phoneBook.containsKey(name)) {
            Phone phone = phoneBook.get(name);
            System.out.println(name + "의 번호와 주소는 "
            		+ phone.getTel() + ", "
            		+ phone.getAddress() + " 입니다.");
        } else {
            System.out.println(name + " 은(는) 없습니다.");
        }
    }

}
