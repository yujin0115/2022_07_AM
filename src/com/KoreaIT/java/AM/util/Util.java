 p a c k a g e   c o m . K o r e a I T . j a v a . A M . u t i l ;  
  
 i m p o r t   j a v a . t e x t . S i m p l e D a t e F o r m a t ;  
 i m p o r t   j a v a . u t i l . D a t e ;  
  
 p u b l i c   c l a s s   U t i l   {  
 	 / /?Ǭ  ????  ?ܬ  
 	 p u b l i c   s t a t i c   S t r i n g   g e t D a t e S t r ( )   {  
 	 	 S i m p l e D a t e F o r m a t   f o r m a t 1   =   n e w   S i m p l e D a t e F o r m a t ( " y y y y - M M - d d   H H : m m : s s " ) ;  
  
 	 	 D a t e   t i m e   =   n e w   D a t e ( ) ;  
  
 	 	 r e t u r n   f o r m a t 1 . f o r m a t ( t i m e ) ;  
 	 }  
 }