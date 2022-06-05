class TextEditor {
    StringBuilder s;
    int cur=0;
    public TextEditor() {
        s=new StringBuilder();
    }
    
    public void addText(String text) {
        s.insert(cur,text);
        
        cur+=text.length();
        //System.out.println(s);
        //cur=s.length();
    }
    
    public int deleteText(int k) {
        int ans=Math.min(k,cur);
        
        while(k-->0 && cur>0){
            s.deleteCharAt(cur-1);
            cur--;
        }
        return ans;
    }
    
    public String cursorLeft(int k) {
        //System.out.println(cur);
        int c=0;
        while(cur>0 && c<k){
            cur--;
            c++;
        }
        if(cur==0)return "";
        int len=Math.min(10,cur);
        return s.substring(cur-len,cur);
    }
    
    public String cursorRight(int k) {
        int c=0;
        while(cur<s.length() && c<k){
            cur++;
            c++;
        }
        int len=Math.min(10,cur);
        
        return s.substring(cur-len,cur);
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */