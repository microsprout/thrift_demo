namespace java demo2

enum Sex {
    Man,
    Woman
}

struct Person {
    1: string name,
    2: i32 age,
    3: Sex sex
}

service Robot {
    string sayHi(
        1: string name
    )

    Person woAreYou(
        1: Person person
    )

    i32 negative(
        1: i32 num
    )
}