package racingcar.model;

public class Car {
    private final String name;
    public Car(String name){
        validateName(name);
        this.name = name;
    }

    private void validateName(String name){
        if(name.length() > 5){
            throw new IllegalArgumentException("이름의 길이는 5자 이하만 가능합니다.");
        }
    }
}
