################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../bin/ChessBoard.cpp \
../bin/Game.cpp \
../bin/Move.cpp \
../bin/Pos.cpp \
../bin/chess-jni.cpp \
../bin/main.cpp 

OBJS += \
./bin/ChessBoard.o \
./bin/Game.o \
./bin/Move.o \
./bin/Pos.o \
./bin/chess-jni.o \
./bin/main.o 

CPP_DEPS += \
./bin/ChessBoard.d \
./bin/Game.d \
./bin/Move.d \
./bin/Pos.d \
./bin/chess-jni.d \
./bin/main.d 


# Each subdirectory must supply rules for building sources it contributes
bin/%.o: ../bin/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: Cygwin C++ Compiler'
	g++ -I/home/will/android-ndk-r10e/platforms/android-18/arch-x86/usr/include -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


