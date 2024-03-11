package explain_240311_Test;

import java.util.HashMap;

public class Phone2 {
	private String name;
	private String tel;
	private String addr;
		// private 변수 선언
	

	public Phone2(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}
	// 변수 할당
	
	
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getAddr() {
		return addr;
	}
	// private 변수를 사용했기 때문에 getter / setter필요
	// 그러나 여기서는 생성자를 통하여 변수를 할당해줄 예정이기에 setter는 불필요함
	
	
	private HashMap<String, Phone2> phoneBook;
	// HaspMap을 사용하기 위해 phoneBook이라는 이름으로 HashMap 선언해 줌
	// key로는 string 타입의 name을, 
	// value에는 name, tel, addr을 전부 넣어주기 위해 Phone2를 사용
	
	
	public Phone2() {
		this.phoneBook = new HashMap<>();
	}
	// Phone2의 phoneBook을 정의함
	// -> 객체의 초기화 작업을 위해 선언과 정의를 따로함
	// 필드를 정의할 때 초기화를 하지 않은 경우
	// 필드는 해당 타입의 기본값으로 초기화 됨
	// 예를 들면 'HashMap' 타입의 'phoneBook' 필드는 기본적으로 'null'로 초기화
	
	// 하지만 명시적인 생성자를 통해 필드를 초기화 하는 것은
	// 코드의 가독성과 유지보수성을 높일 수 있다
	// 예외 처리 등의 추가 작업도 수행 가능
	// 위의 코드는 'Phone2' 클래스의 생성자를 통해
	// 'phoneBook'필드를 'HashMap'객체로 초기화 할 수 있도록 함
	
	
	public void addInfo(String name, String tel, String addr) {
		phoneBook.put(name, new Phone2(name, tel, addr));
	}
	// addInfo()라는 메서드 생성
	// 매개변수로는 name, tel, addr를 받는다
	// 기능 : 'phoneBook'이라는 HashMap에 매개변수로 받은 인자값을
	// key : name / value : Phone2의 값을 할당하게 한다
	
	
	public void searchInfo(String name) {
		// searchInfo라는 메서드 생성
		// 매개변수로는 name을 받음
		
		if (phoneBook.containsKey(name)) {
			// 만약 phoneBook HashMap에 'name'이 포함되어 있다면 { 다음 문장 실행
			
			Phone2 phone2 = phoneBook.get(name);
			// 조건식이 참일 경우)
			// name에 해당하는 정보를 Phone2의 phone2 객체에 저장 후,
			
			System.out.println(name + "의 번호와 주소는 "
							 + phone2.getTel() + ", "
							 + phone2.getAddr() + " 입니다.");
			// 인자값으로 받은 name에 해당하는 정보 출력
			
		} else {
			System.out.println(name + " 은(는) 없습니다.");
			// 조건식이 거짓일 경우)
			// 해당 문구 출력
		}

	}

}
