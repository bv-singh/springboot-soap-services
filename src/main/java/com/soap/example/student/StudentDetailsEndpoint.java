package com.soap.example.student;

import com.infotech.students.GetStudentDetailsRequest;
import com.infotech.students.GetStudentDetailsResponse;
import com.infotech.students.StudentDetails;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentDetailsEndpoint {

  @PayloadRoot(namespace = "http://infotech.com/students", localPart = "GetStudentDetailsRequest")
  @ResponsePayload
  public GetStudentDetailsResponse processCourseRequest(@RequestPayload GetStudentDetailsRequest request){

    GetStudentDetailsResponse response = new GetStudentDetailsResponse();

    StudentDetails studentDetails = new StudentDetails();

    studentDetails.setId(request.getId());

    studentDetails.setName("Adam");

    studentDetails.setPassportNumber("E1234567");

    response.setStudentDetails(studentDetails);

    return response;
  }

}
