package racingcar.model;

public class Car {
    private final String name;
    private int position;
    private final int MAX_NAME_LENGTH = 5;
    private final int MOVE_POWER = 4;

    public Car(String name){
        validateName(name);
        this.name = name;
        this.position = 0;
    }

    private void validateName(String name){
        if(name.length() > MAX_NAME_LENGTH){
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
        if(power >= MOVE_POWER){
            position++;
        }
    }
}
