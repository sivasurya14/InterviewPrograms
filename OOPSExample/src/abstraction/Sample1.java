package abstraction;

    abstract class Sample1 {
	
	protected abstract void display();
	
	
	
    public static void main(String[] args) {
	
    	 Sample1 c = new Sample1() {
			
			@Override
			protected void display() {
				System.out.println("handling exception ");
				
			}
		};
    	
}

}
    
    
	
    	 
	