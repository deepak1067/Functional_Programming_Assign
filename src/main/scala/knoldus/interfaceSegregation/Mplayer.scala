package knoldus.interfaceSegregation

object Mplayer extends App{
  val VlcMediaPlayer = () => {
    "Play Audio & Video on KM Player"

  }
  println(VlcMediaPlayer())

  val DivMediaPlayer = () => {
    "Play Audio & Video on WM Player"
  }
  println(DivMediaPlayer())

  val WinAmpPlayer = () => {
    "Play Audio on VLC Player"
  }
  println(WinAmpPlayer())
}
