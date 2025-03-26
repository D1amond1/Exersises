public class Example<R> {
    private String info = "";

    public String getInfo() {
        return info;
    }

    public void addToString(R r){
        if(this.info.isEmpty()){
            this.info = this.info + r.toString();
        }else{
            this.info = this.info + "\n" + r.toString();
        }
    }
}