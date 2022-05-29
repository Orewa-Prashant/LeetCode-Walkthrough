class Trie {
    class Node{
        char ch;
        Node[] links;
        boolean isEnd;
        Node(char ch){
            this.ch=ch;
            links=new Node[26];
        }
    }
    Node root;
    public Trie() {
        this.root=new Node('*');
    }
    
    public void insert(String word) {
        Node curr=this.root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.links[ch-'a']!=null){
                curr=curr.links[ch-'a'];
            }
            else{
                curr.links[ch-'a']=new Node(ch);
                curr=curr.links[ch-'a'];
            }
        }
        curr.isEnd=true;
    }
    
    public boolean search(String word) {
        Node curr=this.root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(curr.links[ch-'a']!=null){
                curr=curr.links[ch-'a'];
            }
            else{
                return false;
            }
        }
        if(curr.isEnd)return true;
        return false;
    }
    
    public boolean startsWith(String prefix) {
        Node curr=this.root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(curr.links[ch-'a']!=null){
                curr=curr.links[ch-'a'];
            }
            else{
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */