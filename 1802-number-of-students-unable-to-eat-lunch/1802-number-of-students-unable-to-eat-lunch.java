class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student = new LinkedList<>();
        for(int i=0;i<students.length;i++){
            student.add(students[i]);
        }
        int i=0;
        int count=0;

        while(!student.isEmpty()){
            if(student.peek()==sandwiches[i]){
                i++;
                student.poll();
                count=0;
            }
            else{
                student.add(student.poll());
                count++;
            }
            if(count>=student.size()){
                break;
            }
        }
        return student.size();    
    }
}