package model;

public class invLog {
    
    private int logNum;
	private String upn;
    private String did;
    private String sku;
    private String companyname;
    private String ticket;
    
    public invLog(String upn, String did, String sku, String companyname, String ticket) {
		this.upn = upn;
		this.did = did;
		this.sku = sku;
		this.companyname = companyname;
		this.ticket = ticket;
    }
    
    public invLog() {
    	
    }
    
    public int getId() { return logNum; }
    public void setId(int logNum) { this.logNum = logNum; } 
    
    public String getUpn(){ return upn; }
    public void setUpn(String upn) { this.upn = upn; }    
    
    public String getDid(){ return did; }
    public void setDid(String did) { this.did = did; }
    
    public String getSku(){ return sku; }
    public void setSku(String sku) { this.sku = sku; }   
    
    public String getCompanyname(){ return companyname; }
    public void setCompanyname(String companyname) { this.companyname = companyname; }   
    
    public String getTicket(){ return ticket; }
    public void setTicket(String ticket) { this.ticket = ticket; }
    
    
    /*
    private int area;
    private int perimetro;

    public triangulo(String base, String altura)
    {
        this.setBase(Integer.parseInt(base));
        this.setAltura(Integer.parseInt(altura));
    }
    
    public void area(){
        int a=((this.getBase()*this.getAltura())/2);
        this.setArea(a);
    }
    
    public void perimetro(){
    
        int p=this.getBase()*3;
        this.setPerimetro(p);
                
    }

    
    
    
    public int getAltura(){ return altura; }
    public void setAltura(int altura) { this.altura = altura; }
    
    public int getArea(){ return area; }
    public void setArea(int area){ this.area = area; }
    
    public int getPerimetro() { return perimetro; }
    public void setPerimetro(int perimetro){ this.perimetro = perimetro; }
    
    */
    
}