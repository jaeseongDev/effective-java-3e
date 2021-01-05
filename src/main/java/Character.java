//class Character {
//
//    int intelligence, strength, hitPoint, magicPoint;
//
//    public Character(int intelligence, int strength, int hitPoint, int magicPoint) {
//        this.intelligence = intelligence;   // 지능
//        this.strength = strength;           // 힘
//        this.hitPoint = hitPoint;           // HP
//        this.magicPoint = magicPoint;       // MP
//    }
//
//    // '전사 캐릭터'를 생성하는 정적 팩토리 메소드
//    public static Character newWarrior() { //
//        return new Character(5, 15, 20, 3);     // 인스턴스를 생성 후 반환
//    }
//
//    // '마법사 캐릭터'를 생성하는 정적 팩토리 메소드
//    public static Character newMage() {
//        return new Character(15, 5, 10, 15);    // 인스턴스를 생성 후 반환
//    }
//
//    @Override
//    public String toString() {
//        return "Character{" +
//            "intelligence=" + intelligence +
//            ", strength=" + strength +
//            ", hitPoint=" + hitPoint +
//            ", magicPoint=" + magicPoint +
//            '}';
//    }
//}

class Character {
    protected int intelligence, strength, hitPoint, magicPoint;

    public Character(int intelligence, int strength, int hitPoint, int magicPoint) {
        this.intelligence = intelligence;   // 지능
        this.strength = strength;           // 힘
        this.hitPoint = hitPoint;           // HP
        this.magicPoint = magicPoint;       // MP
    }
}