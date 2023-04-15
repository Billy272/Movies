import {Form,Button} from 'react-bootstrap'

const ReviewForm = ({handleSubmit,revText,labelText,defaultValue}) => {
    return (
       <form>
          <Form.Group className="mb-3" controlId="exampleForm.ControlText">
                <Form.Label>Review</Form.Label>
                <Form.Control ref={revText} as="textarea" rows={3} defaultValue={defaultValue} />
          </Form.Group>
          <Button variant="outline-info" onclick={handleSubmit}>Submit</Button>
       </form>
    )
}

export default ReviewForm