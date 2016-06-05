
cool: 
	gcc -w -I/usr/lib/jvm/java-6-openjdk-amd64/include -pthread -fPIC -o libchess-jni.so -shared Pos.cpp ChessBoard.cpp Move.cpp Game.cpp chess-jni.cpp

all:
	g++ -w -I"/opt/java/include" -I"/opt/java/include/linux" -pthread Pos.cpp ChessBoard.cpp Move.cpp Game.cpp chess-jni.cpp -o chess

pg:
	g++ -w -pthread -pg Pos.cpp ChessBoard.cpp Move.cpp Game.cpp chess-jni.cpp -o chess

clean:
	rm -rf *o chess


