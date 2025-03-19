package ex_12_Strings;

public class Tasks_String_ques {
    public static void main(String[] args) {
     /*   1) Can multiple threads access the same String-buffer object at the same time?

                No, we can’t access multiple threads with the same String buffer Object at the same time. String Buffer is Synchronized. First one thread will run, after finishing first thread then only Second thread will start running. Means String Buffer is Thread safety.


        2) How does synchronized affect performance in String-buffer?

                As we know String buffer is Thread safety. One thread will run at a time, Which  makes slow performance.
        3)  Can we make String-builder thread-safe?

                Yes, by manually adding synchronization block to critical section    of code

        4) What happens if two threads try to modify the same String-builder object?

                String builder is not a thread safe so if it is tries to modify on same time it will create inconsistency

        5) Why is String preferred in multi-threading scenarios despite being immutable?

        String is immutable  and thread safe  so it can perform string in multiple Scenario


      */


    }
}
