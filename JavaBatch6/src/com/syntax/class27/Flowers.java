package com.syntax.class27;

//define flower class that will have String type,

	// constructor that initializes a variables and undefine method bloom

public abstract class Flowers {
	
	public String type;
	
	public Flowers(String type){
		this.type=type;
	}
	
	public abstract void  blooms1();
	
}
	
	 class Tulips extends Flowers{
		 
		 String color;
		
		Tulips(String type, String color){
			super(type);
			this.color=color;
		}

		@Override
		public void blooms1() {
			System.out.println(type+" bloom in springs with "+color);
			
		}
	 	
	}
	 class Roses extends Flowers{
		 
		 Roses(String type){
			 super(type);
		 }
		 @Override
		 public void blooms1() {
			 System.out.println(type+" blooms summers");
		 }
	 }
	 
	 class Sunflowers extends Flowers{
		 
		 Sunflowers(String type){
			 super(type);
		 }
		 @Override
		 public void blooms1() {
			 System.out.println(type+" also blooms in summer");
		 }
		 
		 
	 }
 