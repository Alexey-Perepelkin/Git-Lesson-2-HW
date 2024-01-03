package model.animals;

public enum TypeAnimal {
    Dog,
    Cat,
    Hamster,
    Horse,
    Camel,
    Donkey;
    public  TypeAnimal getType(int typeId){
        switch (typeId){
            case 1:
                return TypeAnimal.Cat;
            case 2:
                return TypeAnimal.Dog;
            case 3:
                return TypeAnimal.Camel;
            case 4:
                return TypeAnimal.Donkey;
            case 5:
                return TypeAnimal.Hamster;
            case 6:
                return TypeAnimal.Horse;
            default:
                return null;
        }
    }

}
