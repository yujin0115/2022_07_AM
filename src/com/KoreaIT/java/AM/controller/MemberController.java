 p a c k a g e   c o m . K o r e a I T . j a v a . A M . c o n t r o l l e r  
  
  
 i m p o r t   j a v a . l a n g . r e f l e c t . M e m b e r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
 i m p o r t   j a v a . u t i l . S c a n n e r ;  
  
 i m p o r t   c o m . K o r e a I T . j a v a . A M . U t i l ;  
  
 p u b l i c   c l a s s   M e m b e r C o n t r o l l e r   {  
  
 	 p r i v a t e   s t a t i c   L i s t < M e m b e r >   m e m b e r s ;  
 	 p r i v a t e   S c a n n e r   s c ;  
  
 	 p u b l i c   M e m b e r C o n t r o l l e r ( S c a n n e r   s c ,   L i s t < M e m b e r >   m e m b e r s )   {  
 	 	 t h i s . s c   =   s c ;  
 	 	 t h i s . m e m b e r s   =   m e m b e r s ;  
 	 }  
  
 	 i n t   l a s t M e m b e r I d   =   0 ;  
  
 	 p u b l i c   v o i d   d o J o i n ( L i s t < M e m b e r >   m e m b e r s ,   S c a n n e r   s c )   {  
 	 	 S t r i n g   l o g i n I d   =   n u l l ;  
 	 	 S t r i n g   l o g i n P w   =   n u l l ;  
 	 	 S t r i n g   l o g i n P w C   =   n u l l ;  
  
 	 	 i n t   i d   =   l a s t M e m b e r I d   +   1 ;  
 	 	 l a s t M e m b e r I d   =   i d ;  
 	 	 S t r i n g   r e g D a t e   =   U t i l . g e t D a t e S t r ( ) ;  
 	 	 w h i l e   ( t r u e )   {  
 	 	 	 S y s t e m . o u t . p r i n t f ( "?D?t?   :   " ) ;  
 	 	 	 l o g i n I d   =   s c . n e x t L i n e ( ) ;  
  
 	 	 	 i f   ( i s J o i n a b l e L o g i n I d ( l o g i n I d )   = =   f a l s e )   {  
 	 	 	 	 S y s t e m . o u t . p r i n t f ( " % s  ?? (?@ )  ?t??  ??Ʃ??x  ?D?t?ǅ?Ȳ? \ n " ,   l o g i n I d ) ;  
 	 	 	 	 c o n t i n u e ;  
 	 	 	 }  
  
 	 	 	 b r e a k ;  
 	 	 }  
  
 	 	 w h i l e   ( t r u e )   {  
 	 	 	 S y s t e m . o u t . p r i n t f ( "?D? ???8   :   " ) ;  
 	 	 	 l o g i n P w   =   s c . n e x t L i n e ( ) ;  
 	 	 	 S y s t e m . o u t . p r i n t f ( "?D? ???8  ?U?x :   " ) ;  
 	 	 	 l o g i n P w C   =   s c . n e x t L i n e ( ) ;  
  
 	 	 	 i f   ( l o g i n P w . e q u a l s ( l o g i n P w C )   = =   f a l s e )   {  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( "?D? ???8?|  ????  ǅ?%?t???8Ɣ " ) ;  
 	 	 	 	 c o n t i n u e ;  
 	 	 	 }  
 	 	 	 b r e a k ;  
 	 	 }  
  
 	 	 S y s t e m . o u t . p r i n t f ( "?t??   :   " ) ;  
 	 	 S t r i n g   n a m e   =   s c . n e x t L i n e ( ) ;  
  
 	 	 M e m b e r   m e m b e r   =   n e w   M e m b e r ( i d ,   r e g D a t e ,   l o g i n I d ,   l o g i n P w ,   n a m e ) ;  
 	 	 m e m b e r s . a d d ( m e m b e r ) ;  
  
 	 	 S y s t e m . o u t . p r i n t f ( " % d??  ֌???t  ???1???µ?Ȳ? . \ n " ,   i d ) ;  
  
 	 }  
  
 	 p r i v a t e   b o o l e a n   i s J o i n a b l e L o g i n I d ( S t r i n g   l o g i n I d )   {  
 	 	 i n t   i n d e x   =   g e t M e m b e r I n d e x B y L o g i n I d ( l o g i n I d ) ;  
  
 	 	 i f   ( i n d e x   = =   - 1 )   {  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
  
 	 	 r e t u r n   f a l s e ;  
 	 }  
  
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
  
 }