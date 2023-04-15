import { useEffect,useRef} from "react";
import api from '../../api/axiosConfig';
import { useParams } from 'react-router-dom';
import { Container, Row, Col } from "react-bootstrap";
import ReviewForm from "../reviewForm/ReviewForm";
import React from 'react'

const Reviews = ({getMovieData,movie,reviews,setReviews}) =>{
    const revText = useRef();
    let params = useParams();
    const movieid = params.movieid;

    useEffect(() => {
        getMovieData(movieid);
    },[])

    return(
        <Container>
            <Row>
                <Col>
                    <h3>Reviews</h3>
                </Col>
            </Row>
            <Row className="mt-2">
                <Col>
                    <img src={movie?.poster} alt="" />
                </Col>
                <Col>
                    {
                        <>
                           <Row>
                                <Col>
                                    <ReviewForm handleSubmit={addReview} revText={revText} labelText="Write a Review: " />
                                </Col>
                           </Row>
                           <Row>
                               <Col>
                                   <hr />
                               </Col>
                           </Row>
                        </>
                    }
                    {
                        reviews?.map((review) => {
                            return(
                                <>
                                    <Row>
                                        <Col>{r.body}</Col>
                                    </Row>
                                    <Row>
                                        <Col>
                                            <hr />
                                        </Col>
                                    </Row>
                                </>
                            )
                    }
                </Col>
            </Row>
            <Row>
                <Col>
                    <hr />
                </Col>
            </Row>
        </Container>
    )
}

export default Reviews