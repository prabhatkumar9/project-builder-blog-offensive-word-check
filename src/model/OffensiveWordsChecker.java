package model;

public abstract class OffensiveWordsChecker {

	public abstract boolean checkBlog(Blog blog);
	
	
}

interface OffensiveWordsInterface{
	
	public boolean checkBlogTitle(Blog blog);
	public boolean checkBlogDescription(Blog blog);
	
}
