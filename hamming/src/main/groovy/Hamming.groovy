class Hamming {

  def distance(strand1, strand2) {
    def count = 0
    def res= 0
    for(int i=0; i<strand1.length(); i++){
      if( strand1[i] ==  strand2[i] ){
      }else if( strand1[i] !=  strand2[i] ){
        count++
      }
    }
    return count
  }
}
