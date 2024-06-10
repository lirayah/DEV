function debounce(f,wait)
{
	let timeout 

	return function(...args){
		clearTimeout(timeout)
		timeout=setTimeout(()=>f(...args),wait)
	}
}

export default debounce
