/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestCourse {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("김복동", "GB112", "bk32@ac.kr");
        Course oo1 = new Course(lecturer, "GB111");
        Student s1 = new Student(0, "202011111", "jsl", 0);
        Student s2 = new Student(0, "202011112", "bdk", 0);
        Student s3 = new Student(0, "202011112", "cho", 0);
        // 원래 앞 뒤로 0 없어야 하는 게 맞는데, 
        // Homework2 파일의 Student 클래스랑 겹쳐서 오류남
        // 오류 지우려고 그냥 써둔거임

        oo1.enroll(s1);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.enroll(s2);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.enroll(s3);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.drop(s2);
        System.out.printf("Num of Students: %d\n", oo1.getNumEnrolled());
        oo1.printEnrolled();                      
    }
}