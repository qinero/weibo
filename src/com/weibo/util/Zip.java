package com.weibo.util;


public class Zip {
    private String zip(String word){
        public class Node<T> implements Comparable<Node<T>> {
            private T data;
            private double weight;
            private Node<T> left;
            private Node<T> right;
            String code;

            public Node(T data, double weight){
                this.data = data;
                this.weight = weight;
                this.code = "";

            }

            public T getData() {
                return data;
            }

            public void setData(T data) {
                this.data = data;
            }

            public double getWeight() {
                return weight;
            }

            public void setWeight(double weight) {
                this.weight = weight;
            }

            public Node<T> getLeft() {
                return left;
            }

            public void setLeft(Node<T> left) {
                this.left = left;
            }

            public Node<T> getRight() {
                return right;
            }

            public void setRight(Node<T> right) {
                this.right = right;
            }

            public String getCode(){
                return code;
            }

            public void setCode(String str){
                code = str;
            }

            @Override
            public String toString(){
                return "data:"+this.data+";weight:"+this.weight+";code: "+this.code;
            }

            @Override
            public int compareTo(Node<T> other) {
                if(other.getWeight() > this.getWeight()){
                    return 1;
                }
                if(other.getWeight() < this.getWeight()){
                    return -1;
                }

                return 0;
            }
        }

        public Node<T> createTree(List<Node<T>> nodes) {
            while (nodes.size() > 1) {
                Collections.sort(nodes);

                Node<T> left = nodes.get(nodes.size() - 2);
                left.setCode(0 + "");
                Node<T> right = nodes.get(nodes.size() - 1);
                right.setCode(1 + "");
                Node<T> parent = new Node<T>(null, left.getWeight() + right.getWeight());
                parent.setLeft(left);
                parent.setRight(right);
                nodes.remove(left);
                nodes.remove(right);
                nodes.add(parent);
            }
            return nodes.get(0);
        }

        public List<Node<T>> breadth(Node<T> root) {
            List<Node<T>> list = new ArrayList<Node<T>>();
            Queue<Node<T>> queue = new ArrayDeque<Node<T>>();

            if (root != null) {
                queue.offer(root);
                root.getLeft().setCode(root.getCode() + "0");
                root.getRight().setCode(root.getCode() + "1");
            }

            while (!queue.isEmpty()) {
                list.add(queue.peek());
                Node<T> node = queue.poll();
                if (node.getLeft() != null)
                    node.getLeft().setCode(node.getCode() + "0");
                if (node.getRight() != null)
                    node.getRight().setCode(node.getCode() + "1");

                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }
            return list;
        }

        File file = new File("G:/usually/input/input1.txt");
        public class readtxt {
            char[] chars = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s'
                    ,'t','u','v','w','x','y','z',' '};
            int[] number = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            public String txtString(File file){
                StringBuilder result = new StringBuilder();
                try{
                    BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
                    String s = null;
                    while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                        result.append(System.lineSeparator()+s);
                        num(s);
                    }
                    br.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
                return result.toString();
            }

            public void num(String string){
                for(int i = 0;i<27;i++){
                    int temp = 0;
                    for(int j = 0;j<string.length();j++){
                        if(string.charAt(j) == chars[i])
                            temp++;
                    }
                    number[i] += temp;
                }
            }

            public int[] getNumber(){
                return number;
            }

            public char[] getChars(){
                return chars;
            }
        }

    }

}
