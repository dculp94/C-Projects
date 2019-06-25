GPP = g++ -O3 -Wall

M = Main.o

Aprog: $(M)
	$(GPP) -o Aprog $(M)

Main.o: Main.h Main.cpp
	$(GPP) -o Main.o -c -DEBUG Main.cpp

clean:
	rm Aprog
	clean

