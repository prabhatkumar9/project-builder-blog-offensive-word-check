package model;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{

	public boolean checkBlog(Blog blog){
		checkBlogTitle(blog);
		checkBlogDescription(blog);
		if(checkBlogTitle(blog) && checkBlogDescription(blog)) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean checkBlogTitle(Blog blog) {
		for(int i =0;i<offword.length;i++) {
			if(blog.getBlogTitle().equals(offword[i])) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		for(int i =0;i<offword.length;i++) {
			if(blog.getBlogDescription().equals(offword[i]) ) {
				return false;
			}
		}
		return true;
	}

	String str = "asscracker,asses,assface ,assfaces ,assfuck,bastard,bastardo,bastards,bastinado,boobs,booby,booger,bookie,boong,booobs,chincs,chink,chinky,choad,choade,cockknocker,cockknoker,Cocklump,cockmaster,cockmongler,cocknose";
	String[] offword = str.split(",");	
}





