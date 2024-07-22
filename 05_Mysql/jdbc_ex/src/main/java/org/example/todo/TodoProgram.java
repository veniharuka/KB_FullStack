package org.example.todo;

import java.util.Scanner;

public class TodoProgram {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        Scanner sc = new Scanner(System.in);

        UserVo loggedInUser = null;
        while (loggedInUser == null) {
            System.out.println("TodoList 오신 것을 환영합니다.");
            System.out.println("로그인을 해주십시오.");
            System.out.println("ID : ");
            String userId = sc.nextLine();
            System.out.println("PASSWORD : ");
            String password = sc.nextLine();

            loggedInUser = userDao.loginUser(userId, password);
            if (loggedInUser == null) {
                System.out.println("로그인 정보가 잘못되었습니다. 다시 시도하십시오.");
            }

        }

        TodoDaoImpl todoDao = new TodoDaoImpl();

        int totalTodoCount = todoDao.getTotalCount(loggedInUser.getUser_id());
        System.out.println(loggedInUser.getName() + " 님 반갑습니다!");
        System.out.println(loggedInUser.getName() + " 님의 총 Todo 개수 : " + totalTodoCount);


        while (true) {
            System.out.println("====== TodoList 프로그램 ======");
            System.out.println("1. Todo 전체 목록 조회");
            System.out.println("2. Todo 미완료 목록 조회");
            System.out.println("3. Todo 완료 목록 조회");
            System.out.println("4. Todo 완료 처리");
            System.out.println("5. Todo 추가");
            System.out.println("6. Todo 삭제");
            System.out.println("7. Todo 전체 목록 + 작성자 확인");
            System.out.println("8. 프로그램 종료");
            System.out.print("원하는 작업 번호를 입력하세요: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                // 로그인한 사용자가 작성한 Todo 전체 목록 조회는 TodoDaoImpl 의 getTodosByUserId 에 구현되어있으므로 해당 메서드 실행
                // user_id 는  loggedInUser 에 저장되어 있으므로 Getter 를 사용하여 로그인한 사용자의 id 를 전달
                todoDao.getTodosByUserId(loggedInUser.getUser_id());
            } else if (choice == 2) {
                // 로그인한 사용자가 작성한 Todo 미완료 목록 조회는 TodoDaoImpl 의 getUncompletedTodosUserId 에 구현되어있으므로 해당 메서드 실행
                // user_id 는  loggedInUser 에 저장되어 있으므로 Getter 를 사용하여 로그인한 사용자의 id 를 전달
                todoDao.getUncompletedTodosUserId(loggedInUser.getUser_id());
            } else if (choice == 3) {
                // 로그인한 사용자가 작성한 Todo 완료 목록 조회는 TodoDaoImpl 의 getCompletedTodosByUserId 에 구현되어있으므로 해당 메서드 실행
                // user_id 는  loggedInUser 에 저장되어 있으므로 Getter 를 사용하여 로그인한 사용자의 id 를 전달
                todoDao.getCompletedTodosByUserId(loggedInUser.getUser_id());
            } else if (choice == 4) {
                // 완료 처리할 todo 의 id 를 입력 받기
                System.out.print("완료 처리할 Todo 의 ID 숫자를 입력해 주세요 : ");
                int id = sc.nextInt();
                sc.nextLine();
                // makeTodoCompleted 메서드에 입력 받은 todo id 와 사용자의 user_id 를 전달하여 처리
                todoDao.makeTodoCompleted(id, loggedInUser.getUser_id());
            } else if (choice == 5) {
                // 추가할 todo 의 내용을 입력 받기
                System.out.print("추가할 Todo 의 내용을 입력해 주세요 : ");
                String todo = sc.nextLine();
                // createTodo 메서드에 입력 받은 todo 내용과 사용자의 user_id 를 전달하여 처리
                todoDao.createTodo(todo, loggedInUser.getUser_id());
            } else if (choice == 6) {
                // 삭제할 todo 의 id 입력 받기
                System.out.print("삭제 처리할 Todo 의 ID 숫자를 입력해 주세요 : ");
                int id = sc.nextInt();
                sc.nextLine();
                // deleteTodo 메서드에 삭제 할 todo id 와 사용자의 user_id 를 전달하여 처리
                todoDao.deleteTodo(id, loggedInUser.getUser_id());
            } else if (choice == 7) {
                // getAllTodosWithUserName 메서드를 실행하여 JOIN 된 테이블의 정보를 출력
                todoDao.getAllTodosWithUserName();
            } else if (choice == 8) {
                return;
            } else {
                System.out.println("잘못된 선택입니다. 다시 시도하십시오.");
            }
        }
    }
}