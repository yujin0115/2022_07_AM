 p a c k a g e   c o m . K o r e a I T . j a v a . A M ;  
  
 i m p o r t   j a v a . l a n g . r e f l e c t . M e m b e r ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
 i m p o r t   j a v a . u t i l . S c a n n e r ;  
  
 i m p o r t   c o m . K o r e a I T . j a v a . A M . c o n t r o l l e r . A r t i c l e C o n t r o l l e r ;  
 i m p o r t   c o m . K o r e a I T . j a v a . A M . c o n t r o l l e r . M e m b e r C o n t r o l l e r ;  
 i m p o r t   c o m . K o r e a I T . j a v a . A M . d t o . A r t i c l e ;  
 i m p o r t   c o m . K o r e a I T . j a v a . A M . d t o . M e m b e r ;  
 i m p o r t   c o m . K o r e a I T . j a v a . A M . u t i l . U t i l ;  
  
 p u b l i c   c l a s s   M a i n   {  
 	 p r i v a t e   s t a t i c   L i s t < A r t i c l e >   a r t i c l e s ;  
 	 p r i v a t e   s t a t i c   L i s t < A r t i c l e >   m e m b e r s ;  
 	 s t a t i c   {  
 	 	 a r t i c l e s   =   n e w   A r r a y L i s t < > ( ) ;  
 	 }  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S y s t e m . o u t . p r i n t l n ( " = =??\????  ??Ǒ = = " ) ;  
  
 	 	 m a k e T e s t D a t a ( ) ;  
 	 	 S c a n n e r   s c   =   n e w   S c a n n e r ( S y s t e m . i n ) ;  
 	 	 i n t   l a s t A r t i c l e I d   =   3 ;  
 	 	 i n t   l a s t m e m b e r I d   =   0 ;  
 	 	 w h i l e   ( t r u e )   {  
 	 	 	 S y s t e m . o u t . p r i n t f ( "???9Ŵ ) " ) ;  
 	 	 	 S t r i n g   c m d   =   s c . n e x t L i n e ( ) . t r i m ( ) ;  
 	 	 	 i f   ( c m d . e q u a l s ( " e x i t " ) )   {  
 	 	 	 	 b r e a k ;  
 	 	 	 }  
  
 	 	 	 i f   ( c m d . l e n g t h ( )   = =   0 )   {  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( "???9Ŵ?|  ǅ?%?t???8Ɣ . " ) ;  
 	 	 	 	 c o n t i n u e ;  
 	 	 	 }  
                         i f   ( c m d . e q u a l s ( " m e m b e r   j o i n " ) )   {  
                         	         S t r i n g   l o g i n I d =   n u l l ;  
                         	         S t r i n g   l o g i n P w   =   n u l l ;  
 	 	 	 	         S t r i n g   l o g i n P w C =   n u l l ;  
 	 	 	 	          
                         	  
         	 	 	 	 i n t   i d   =   l a s t m e m b e r I d   +   1 ;  
         	 	 	 	 l a s t A r t i c l e I d   =   i d ;  
         	 	 	 	 S t r i n g   r e g D a t e   =   U t i l . g e t D a t e S t r ( ) ;  
         	 	 	 	 w h i l e   ( t r u e )   {  
         	 	 	 	     S y s t e m . o u t . p r i n t f ( "?D?t? : " ) ;  
         	 	 	             l o g i n I d   =   s c . n e x t L i n e ( ) ;  
         	 	 	 	  
         	 	 	             i f   ( i s j o i n a b l e L o g i n I d ( l o g i n I d ) = = f a l s e   )   {  
         	 	 	         	     S y s t e m . o u t . p r i n t f ( " % s  ?? (?@ )  ?t??  ??Ʃ??x  ?D?t?ǅ?Ȳ? \ n " ,   l o g i n I d ) ;  
     	 	 	 	 	 	     c o n t i n u e ;    
         	 	 	               }  
         	 	 	             b r e a k ;  
         	 	 	 	 }  
         	 	 	 	  
         	 	 	 	 w h i l e ( t r u e )   {  
         	 	 	 	 S y s t e m . o u t . p r i n t l n ( "?D? ???8 : " ) ;  
         	 	 	 	 l o g i n P w   =   s c . n e x t L i n e ( ) ;  
         	 	 	 	 S y s t e m . o u t . p r i n t l n ( "?D? ???8  ?U?x : " ) ;  
         	 	 	         l o g i n P w C         =   s c . n e x t L i n e ( ) ;  
         	 	 	 	   i f   ( l o g i n P w . e q u a l s ( l o g i n P w C ) = = f a l s e )   {  
         	 	 	 	 	   S y s t e m . o u t . p r i n t l n ( "?D? ???8?|  ????  ǅ?%?X?8Ɣ " ) ;  
         	 	 	 	 	   c o n t i n u e ;  
         	 	 	 	   }  
         	 	 	 	   b r e a k ;  
         	 	 	 	 }  
         	 	 	 	 S y s t e m . o u t . p r i n t l n ( "?t?? : " ) ;  
         	 	 	 	 S t r i n g   n a m e   =   s c . n e x t L i n e ( ) ;  
         	 	 	 	  
         	 	 	 	 M e m b e r   m e m b e r   =   n e w   M e m b e r   ( i d ,   r e g D a t e ,   l o g i n I d ,   l o g i n P w ,   n a m e ) ;  
         	 	 	 	 m e m b e r s . a d d ( m e m b e r ) ;  
  
         	 	 	 	 S y s t e m . o u t . p r i n t f ( " % d??  ֌???t  ???1???µ?Ȳ? . \ n " ,   i d ) ;  
         	 	 	  
         	 	 	 }  
                             e l s e   i f   ( c m d . e q u a l s ( " a r t i c l e   w r i t e " ) )   {  
 	 	 	 	 i n t   i d   =   l a s t A r t i c l e I d   +   1 ;  
 	 	 	 	 l a s t A r t i c l e I d   =   i d ;  
 	 	 	 	 S t r i n g   r e g D a t e   =   U t i l . g e t D a t e S t r ( ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( "??? : " ) ;  
 	 	 	 	 S t r i n g   t i t l e   =   s c . n e x t L i n e ( ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( "??Ʃ : " ) ;  
 	 	 	 	 S t r i n g   b o d y   =   s c . n e x t L i n e ( ) ;  
  
 	 	 	 	 A r t i c l e   a r t i c l e   =   n e w   A r t i c l e ( i d ,   r e g D a t e ,   t i t l e ,   b o d y ) ;  
 	 	 	 	 a r t i c l e s . a d d ( a r t i c l e ) ;  
  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( " % d??  ? ?t  ???1???µ?Ȳ? . \ n " ,   i d ) ;  
  
 	 	 	 }   e l s e   i f   ( c m d . e q u a l s ( " a r t i c l e   l i s t " ) )   {  
 	 	 	 	 i f   ( a r t i c l e s . s i z e ( )   = =   0 )   {  
 	 	 	 	 	 S y s t e m . o u t . p r i n t l n ( "???ܮ ?t  ??µ?Ȳ? . " ) ;  
 	 	 	 	 	 c o n t i n u e ;  
 	 	 	 	 }  
  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( "???8   |  ???   |?p֌ " ) ;  
 	 	 	 	 f o r   ( i n t   i   =   a r t i c l e s . s i z e ( )   -   1 ;   i   > =   0 ;   i - - )   {  
 	 	 	 	 	 A r t i c l e   a r t i c l e   =   a r t i c l e s . g e t ( i ) ;  
 	 	 	 	 	 S y s t e m . o u t . p r i n t f ( " % 4 d   |     % s   | % d   \ n " ,   a r t i c l e . i d ,   a r t i c l e . t i t l e ,   a r t i c l e . h i t ) ;  
 	 	 	 	 }  
 	 	 	 }   e l s e   i f   ( c m d . s t a r t s W i t h ( " a r t i c l e   d e t a i l " ) )   {  
 	 	 	 	 S t r i n g [ ]   c m d B i t s   =   c m d . s p l i t ( "   " ) ;  
 	 	 	 	 i n t   i d   =   I n t e g e r . p a r s e I n t ( c m d B i t s [ 2 ] ) ;  
  
 	 	 	 	 A r t i c l e   f o u n d A r t i c l e   =   g e t A r t i c l e B y I d ( i d ) ;  
 	 	 	 	 i f   ( f o u n d A r t i c l e   = =   n u l l )   {  
 	 	 	 	 	 S y s t e m . o u t . p r i n t f ( " % d??  ???ܮ ?@  ?tǬ?X??  ?Jµ?Ȳ? \ n . " ,   i d ) ;  
 	 	 	 	 	 c o n t i n u e ;  
  
 	 	 	 	 }  
 	 	 	 	 f o u n d A r t i c l e . i n c r e a s e H i t ( ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( "???8   : % d \ n " ,   f o u n d A r t i c l e . i d ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( "???? : % s \ n " ,   f o u n d A r t i c l e . r e g D a t e ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( "???   : % d \ n " ,   f o u n d A r t i c l e . t i t l e ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( "??Ʃ   : % d \ n " ,   f o u n d A r t i c l e . b o d y ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( "?p֌   : % d \ n " ,   f o u n d A r t i c l e . h i t ) ;  
  
 	 	 	 }   e l s e   i f   ( c m d . s t a r t s W i t h ( " a r t i c l e   m o d i f y " ) )   {  
 	 	 	 	 S t r i n g [ ]   c m d B i t s   =   c m d . s p l i t ( "   " ) ;  
  
 	 	 	 	 i n t   i d   =   I n t e g e r . p a r s e I n t ( c m d B i t s [ 2 ] ) ;  
  
 	 	 	 	 A r t i c l e   f o u n d A r t i c l e   =   g e t A r t i c l e B y I d ( i d ) ;  
 	 	 	 	 i f   ( f o u n d A r t i c l e   = =   n u l l )   {  
 	 	 	 	 	 S y s t e m . o u t . p r i n t f ( " % d??  ???ܻ<?@  ?tǬ?X??  ?Jµ?Ȳ? . \ n " ,   i d ) ;  
 	 	 	 	 	 c o n t i n u e ;  
 	 	 	 	 }  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( "????? : " ) ;  
 	 	 	 	 S t r i n g   t i t l e   =   s c . n e x t L i n e ( ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( "?Ȱ?Ʃ : " ) ;  
 	 	 	 	 S t r i n g   b o d y   =   s c . n e x t L i n e ( ) ;  
  
 	 	 	 	 f o u n d A r t i c l e . t i t l e   =   t i t l e ;  
 	 	 	 	 f o u n d A r t i c l e . b o d y   =   b o d y ;  
  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( " % d??  ? ?D  ??Ոµ?Ȳ? . \ n " ,   i d ) ;  
  
 	 	 	 }   e l s e   i f   ( c m d . s t a r t s W i t h ( " a r t i c l e   d e l a t e " ) )   {  
 	 	 	 	 S t r i n g [ ]   c m d B i t s   =   c m d . s p l i t ( "   " ) ;  
  
 	 	 	 	 i n t   i d   =   I n t e g e r . p a r s e I n t ( c m d B i t s [ 2 ] ) ;  
  
 	 	 	 	 i n t   f o u n d I n d e x   =   g e t A r t i c l e I n d e x B y I d ( i d ) ;  
  
 	 	 	 	 i f   ( f o u n d I n d e x   = =   - 1 )   {  
 	 	 	 	 	 S y s t e m . o u t . p r i n t f ( " % d??  ???ܮ ?@  ?tǬ?X??  ?Jµ?Ȳ? \ n . " ,   i d ) ;  
 	 	 	 	 	 c o n t i n u e ;  
  
 	 	 	 	 }  
  
 	 	 	 	 a r t i c l e s . r e m o v e ( f o u n d I n d e x ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( " % d??  ? ?D  ???Ոµ?Ȳ? . \ n " ,   i d ) ;  
 	 	 	 }   e l s e   {  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( "?tǬ?X??  ?J??  ???9Ŵǅ?Ȳ? " ) ;  
  
 	 	 	 }  
 	 	 }  
  
 	 	 s c . c l o s e ( ) ;  
 	 	 S y s t e m . o u t . p r i n t l n ( " = =??\????  ?] = = " ) ;  
 	 }  
  
 	 p r i v a t e   s t a t i c   b o o l e a n   i s j o i n a b l e L o g i n I d ( S t r i n g   l o g i n I d )   {  
                         i n t   i n d e x   =   g e t M e m b e r I n d e x B y L o g i n I d ( l o g i n I d ) ;  
                          
                         i f   ( i n d e x = = - 1 )   {  
                         	 r e t u r n   t r u e ;  
                         }  
                         r e t u r n   f a l s e ;  
 	 }  
 	 p r i v a t e   i n t   g e t M e m b e r I n d e x B y L o g i n I d ( S t r i n g   l o g i n I d )   {  
 	 	 i n t   i   =   0 ;  
 	 	 f o r   ( M e m b e r   m e m b e r   :   m e m b e r s )   {  
  
 	 	 	 i f   ( m e m b e r . l o g i n I d . e q u a l s ( l o g i n I d ) )   {  
 	 	 	 	 r e t u r n   i ;  
 	 	 	 }  
 	 	 	 i + + ;  
 	 	 }  
 	 	 r e t u r n   - 1 ;  
 	 }  
    
 	 p r i v a t e   s t a t i c   i n t   g e t A r t i c l e I n d e x B y I d ( i n t   i d )   {  
 	 	 i n t   i   =   0 ;  
 	 	 f o r   ( A r t i c l e   a r t c l e   :   a r t i c l e s )   {  
  
 	 	 	 i f   ( a r t c l e . i d   = =   i d )   {  
 	 	 	 	 r e t u r n   i ;  
 	 	 	 }  
 	 	 	 i + + ;  
 	 	 }  
 	 	 r e t u r n   - 1 ;  
  
 	 }  
  
 	 p r i v a t e   s t a t i c   A r t i c l e   g e t A r t i c l e B y I d ( i n t   i d )   {  
 	 	 i n t   i n d e x   =   g e t A r t i c l e I n d e x B y I d ( i d ) ;  
 	 	 i f   ( i n d e x   ! =   - 1 )   {  
 	 	 	 r e t u r n   a r t i c l e s . g e t ( i n d e x ) ;  
 	 	 }  
  
 	 	 r e t u r n   n u l l ;  
 	 }  
  
 	 p r i v a t e   s t a t i c   v o i d   m a k e T e s t D a t a ( )   {  
 	 	 S y s t e m . o u t . p r i n t l n ( "?L¤Ҹ?|  ??\  ?p?t?0?|  ???1?i?Ȳ? . " ) ;  
  
 	 	 a r t i c l e s . a d d ( n e w   A r t i c l e ( 1 ,   U t i l . g e t D a t e S t r ( ) ,   "??? 1 " ,   "??Ʃ 1 " ,   1 0 ) ) ;  
 	 	 a r t i c l e s . a d d ( n e w   A r t i c l e ( 2 ,   U t i l . g e t D a t e S t r ( ) ,   "??? 2 " ,   "??Ʃ 2 " ,   2 0 ) ) ;  
 	 	 a r t i c l e s . a d d ( n e w   A r t i c l e ( 3 ,   U t i l . g e t D a t e S t r ( ) ,   "??? 3 " ,   "??Ʃ 3 " ,   3 0 ) ) ;  
 	 }  
 }  
  
 p u b l i c   c l a s s   A r t i c l e   {  
 	 i n t   i d ;  
 	 S t r i n g   r e g D a t e ;  
 	 S t r i n g   t i t l e ;  
 	 S t r i n g   b o d y ;  
 	 i n t   h i t ;  
  
 	 p u b l i c   A r t i c l e ( i n t   i d ,   S t r i n g   r e g D a t e ,   S t r i n g   t i t l e ,   S t r i n g   b o d y )   {  
 	 	 t h i s ( i d ,   r e g D a t e ,   t i t l e ,   b o d y ,   0 ) ;  
 	 }  
  
 	 p u b l i c   A r t i c l e ( i n t   i d ,   S t r i n g   r e g D A t e ,   S t r i n g   t i t l e ,   S t r i n g   b o d y ,   i n t   h i t )   {  
 	 	 t h i s . i d   =   i d ;  
 	 	 t h i s . r e g D a t e   =   r e g D a t e ;  
 	 	 t h i s . t i t l e   =   t i t l e ;  
 	 	 t h i s . b o d y   =   b o d y ;  
 	 	 t h i s . h i t   =   0 ;  
 	 }  
  
 	 p u b l i c   v o i d   i n c r e a s e H i t ( )   {  
 	 	 h i t + + ;  
 	 }  
 }  
