package oop20230801.crud;

import java.util.*;

public class DaoClass {//Data Access Object DB 데이터에 접근하기 위한 객체 

	Scanner sc = new Scanner(System.in);
	DtoClass dtoArr[] = new DtoClass[20];  //20면(page)책
	
	//용도별 필드 생성
	private boolean swit[] = new boolean[20]; //bollean타입의 배열사용한 이유 
	private int pageNum;                      //해당 배열이 비어있는지 구분하기 위해서 //switch의 swit
	private String check;                                         
	
	
	public DaoClass() {
		
	}
	//1.Insert - 추가
	public void insert() {
		System.out.println();
		
		//페이지가 사용가능한지 구분하는 코드
		for(int i = 0; i < dtoArr.length; i++) {
			if(swit[dtoArr.length-1] == true) {
				System.out.println("더 이상 페이지를 추가할수 없습니다.");
				return;
			}else if(swit[i] == false) {
				System.out.println((i+1)+"번 페이지에 작성하실 수 있습니다.");
				break;
			}
			
		}//for end
		System.out.print("# 나이\n>>>");
		int age = sc.nextInt();
		System.out.print("# 이름\n>>>");
		String name = sc.next();
		System.out.print("# 생년월일\n>>>");
		String birth = sc.next();
		System.out.print("# 주소\n>>>");
		String address = sc.next();
		
		for(int i = 0; i<dtoArr.length; i++) {
			if(swit[i]==false) {
				swit[i]=true;
				pageNum = i + 1;
				dtoArr[i]=new DtoClass(pageNum, age, name, birth, address);
				System.out.println(pageNum + " 번 페이지가 작성되었습니다.");
				break;
			}
		}
		
	}//insert end
	
	//2. Delete - 삭제
	public void delete() {
		System.out.print("\n삭제하고 싶은 책의 페이지를 입력하시오(1~20)\n>>>");
		pageNum = sc.nextInt();
		
		if(dtoArr[pageNum - 1] == null) {//해당 배열값이 비어있으면 null값으로 초기화 되어있기 때문에 null로 판별
			System.out.println("\n작성된 페이지가 없는 쪽수입니다.");
			return;
		}
		System.out.println("\n삭제하고 싶은" + pageNum + "페이지의 내용입니다.");
		System.out.println(dtoArr[pageNum-1].toString());//사용자가 읽을때와 다르게 실제 배열은 pageNum-1 값에 저장됨
		System.out.println("페이지를 삭제하고 싶으시면 'Y'아니면 'N'을 입력하십시오\n");
		
		check = sc.next();//check필드에 Scanner 입력값 대입
		if(check.equals("y")||check.equals("Y")) {//equals 메서드 사용하여 대소문자 구분
			swit[pageNum-1]=false; //boolean 타입 swit배열 초기값은 false이므로 아무것도 없을경우 false
			dtoArr[pageNum-1]=null;//dtoArr배열의 초기값은 null
			System.out.println("\n페이지가 삭제되었습니다.");//swit배열과 dtoArr배열값이 비어있는거 확인후 문자출력
		}else {
			System.out.println("\n삭제를 취소합니다.");
			return;
		}
	}//delete()end
	//3. Search - 검색
	public void search() {
		System.out.println("검색하고 싶은 책의 페이지를 입력하세요(1~20)\n>>>");
		pageNum = sc.nextInt();
		
		if(dtoArr[pageNum - 1] == null) {
			System.out.println("\n작성된 페이지가 없는 쪽수입니다.");
			return;
		}
		System.out.println("\n검색하고 싶은" + pageNum + "페이지의 내용입니다.");
		System.out.println(dtoArr[pageNum - 1].toString());
				
	}//search end
    //4. Update - 수정, 갱신
	public void update() {
		System.out.println("수정하고 싶은 책의 페이지를 입력하세요(1~20)\n>>>");
		pageNum = sc.nextInt();
		
		if(dtoArr[pageNum - 1] == null) {
			System.out.println("\n작성된 페이지가 없는 쪽수입니다.");
			return;
		}
			System.out.println("\n수정하고 싶은" + pageNum + "페이지의 내용입니다.");
			System.out.println(dtoArr[pageNum - 1].toString());
			
			System.out.println("페이지를 수정하고 싶으시면 'Y' 아니면 'N'를 입력하세요\n>>>");
			check = sc.next();
			
			if(check.equals("y")||check.equals("Y")) {
				//페이지 수정 : 페이지 내의 전체 정보(필드) 수정(대입, 덮어쓰기)
				System.out.print("# 나이\n>>>");
				int age = sc.nextInt();
				System.out.print("# 이름\n>>>");
				String name = sc.next();
				System.out.print("# 생년월일\n>>>");
				String birth = sc.next();
				System.out.print("# 주소\n>>>");
				String address = sc.next();
				
				dtoArr[pageNum-1] = new DtoClass(pageNum, age, name, birth, address);
				
				System.out.println("\n페이지가 수정되었습니다.");
				
			}
		}//update end
		
		
	}//update()end
	

