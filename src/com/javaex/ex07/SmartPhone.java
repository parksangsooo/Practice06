package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
    	
    	// str -> 음악 : MusicPhone 에서 처리
    	// 		기본처리 : Phone
    	// 		앱 : 본 클래스에서 앱실행 코드 처리
    	
        
    	if("앱".equals(str)) {
    		runApp();
    	} else { 	// 나머지는 부모 메서드에 위임.
    		super.execute(str);
    	}
    	
        
    }
 
    //메소드작성
    public void playMusic() {
    	System.out.println("다운로드해서 음악재생");
    }
    //메소드작성
    public void runApp() {
    	System.out.println("앱 실행");
    }    
    
    
}
