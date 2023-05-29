package me.whiteship.chapter01.item02.builder;

public class BuilderTest {

    public static void main(String[] args) {
        new NutritionFacts.Builder(10, 10)
                .calories(10)
                .build();

//        new NutritionFactsLombok(3, 3, 3, 3, 3, 3);
        // @AllArgsConstructor(access = AccessLevel.PRIVATE) 일 경우 위 코드 불가능
        // 아래처럼 Builder를 사용해서만 접근 가능
        new NutritionFactsLombok.NutritionFactsLombokBuilder()
                .servingSize(3).build();
    }
}
