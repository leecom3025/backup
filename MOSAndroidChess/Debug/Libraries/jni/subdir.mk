################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../Libraries/jni/ChessBoard.cpp \
../Libraries/jni/Game.cpp \
../Libraries/jni/Move.cpp \
../Libraries/jni/Pos.cpp \
../Libraries/jni/chess-jni.cpp \
../Libraries/jni/main.cpp 

OBJS += \
./Libraries/jni/ChessBoard.o \
./Libraries/jni/Game.o \
./Libraries/jni/Move.o \
./Libraries/jni/Pos.o \
./Libraries/jni/chess-jni.o \
./Libraries/jni/main.o 

CPP_DEPS += \
./Libraries/jni/ChessBoard.d \
./Libraries/jni/Game.d \
./Libraries/jni/Move.d \
./Libraries/jni/Pos.d \
./Libraries/jni/chess-jni.d \
./Libraries/jni/main.d 


# Each subdirectory must supply rules for building sources it contributes
Libraries/jni/%.o: ../Libraries/jni/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: Cygwin C++ Compiler'
	g++ -I/home/will/android-ndk-r10e/platforms/android-18/arch-x86/usr/include -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


