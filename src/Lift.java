public class Lift {
    private int currentFloor;
    private int capacity;
    private int maxFloor;

    public Lift(int currentFloor, int capacity, int maxFloor) {
        this.currentFloor = currentFloor;
        this.capacity = capacity;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }

    @Override
    public String toString() {
        return "Lift\n" +
                "currentFloor: " + currentFloor +
                "\n capacity : " + capacity +
                "\n maxFloor:" + maxFloor ;
    }

    public void toFloor(int whichFloor, int capacity,int r){
        try{
            if (r==1){
                throw new Exception();
            }else {
        if (floor(whichFloor)==true&&weight(capacity)==true){
    int count=0;
            for (int i = currentFloor; i < whichFloor; i++) {
                count++;
            }
            System.out.printf("Сколько пройдено этажей : %d от %d до %d ", count,currentFloor,whichFloor);
            currentFloor=whichFloor;
        }else{
                    System.out.println("Такого этажа не существует, или вес недопустим");
        }
    }

    }catch (Exception e){
            System.out.println("Лифт застрял");
        }
    }
    public Boolean floor(int whichFloor){
        if (whichFloor>maxFloor){
            return false;
        }else {
            return true;
        }
    }
    public Boolean weight(int capacity2){
        if (capacity2>capacity){
            return false;
        }else {
            return true;
        }
    }
}
