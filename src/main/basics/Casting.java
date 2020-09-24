package main.basics;

public class Casting {

    // int / float
    int int1 = 1;
    float float1 = int1;

    float float2 = 1.0f;
    int int2 = (int) float2;

    // int / String
    int int3 = 3;
    String string1 = String.valueOf(int3);

    String string2 = "1";
    int int4 = Integer.parseInt(string2);

    // double / float
    double double1 = 1.0;
    float float3 = (float) double1;

    float float4 = 1.0f;
    double double2 = float4;


}
