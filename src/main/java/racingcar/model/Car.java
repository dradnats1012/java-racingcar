package racingcar.model;

public class Car {
    private final String name;
    private int position;

    public Car(String name){
        validateName(name);
        this.name = name;
        this.position = 0;
    }

    private void validateName(String name){
        if(name.length() > 5){
            throw new IllegalArgumentException("이름의 길이는 5자 이하만 가능합니다.");
        }
        if(name.isBlank() || name.length() == 0){
            throw new IllegalArgumentException("이름은 공백이 될 수 없습니다.");
        }
    }

    public int getPosition(){
        return position;
    }

    public void move(int power){
        if(power >= 4){
            position++;
        }
    }
}
