//Сделано с помощью ИИ "DeepSeek"
package org.example;

public class TenThreadsExample1 {
    public static void main(String[] args) {
        System.out.println("=== Запуск 10 потоков (наследование от Thread) ===");
        for (int i = 1; i <= 10; i++) {
            MyThread thread = new MyThread(i);
            thread.start();
        }

        System.out.println("Основной поток завершен.");
    }

    static class MyThread extends Thread {
        private int threadNumber;

        public MyThread(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            System.out.println("Поток " + threadNumber + " запущен. ID: " + Thread.currentThread().getId());

            try {
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Поток " + threadNumber + " завершен.");
        }
    }
}